package com.example.to_docompose.ui.screens.list

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.SnackbarResult
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import com.example.to_docompose.R
import com.example.to_docompose.ui.viewmodels.SharedViewModel
import com.example.to_docompose.util.Action
import com.example.to_docompose.util.SearchAppBarState
import kotlinx.coroutines.launch

@Composable
fun ListScreen(
    navigateToTaskScreen: (Int) -> Unit,
    sharedViewModel: SharedViewModel
) {
    LaunchedEffect(key1 = true) {
        sharedViewModel.getAllTasks()
        sharedViewModel.readSortState()
    }

    val action by sharedViewModel.action
    val snackBarHostState = remember { SnackbarHostState() }

    DisplaySnackBar(
        snackBarHostState = snackBarHostState,
        handleDatabaseAction = { sharedViewModel.handleDatabaseActions(action) },
        onUndoClicked = { sharedViewModel.action.value = it },
        taskTitle = sharedViewModel.title.value,
        action = action
    )

    val allTasks by sharedViewModel.allTasks.collectAsState()
    val searchedTasks by sharedViewModel.searchedTasks.collectAsState()
    val sortState by sharedViewModel.sortState.collectAsState()
    val lowPriorityTasks by sharedViewModel.lowPriorityTasks.collectAsState()
    val highPriorityTasks by sharedViewModel.highPriorityTasks.collectAsState()

    val searchAppBarState: SearchAppBarState by sharedViewModel.searchAppBarState
    val searchTextState: String by sharedViewModel.searchTextState

    Scaffold(
        snackbarHost = { SnackbarHost(hostState = snackBarHostState) },
        topBar = {
            ListAppBar(
                sharedViewModel = sharedViewModel,
                searchAppBarState = searchAppBarState,
                searchTextState = searchTextState
            )
        },
        content = { paddingValues ->
            ListContent(
                modifier = Modifier.padding(paddingValues),
                allTasks = allTasks,
                lowPriorityTasks = lowPriorityTasks,
                highPriorityTasks = highPriorityTasks,
                sortState = sortState,
                searchedTasks = searchedTasks,
                searchAppBarState = searchAppBarState,
                onSwipeToDelete = { action, todoTask ->
                    sharedViewModel.action.value = action
                    sharedViewModel.updateTaskFields(selectedTask = todoTask)
                },
                navigateToTaskScreen = navigateToTaskScreen
            )
        },
        floatingActionButton = {
            ListFab(navigateToTaskScreen)
        })
}

@Composable
fun ListFab(
    onFabClicked: (taskId: Int) -> Unit
) {
    FloatingActionButton(onClick = {
        onFabClicked(-1)
    }) {
        Icon(
            imageVector = Icons.Filled.Add,
            contentDescription = stringResource(R.string.add_button),
            tint = Color.White
        )
    }
}

@Composable
fun DisplaySnackBar(
    snackBarHostState: SnackbarHostState,
    handleDatabaseAction: () -> Unit,
    onUndoClicked: (Action) -> Unit,
    taskTitle: String,
    action: Action,
) {
    handleDatabaseAction()

    val scope = rememberCoroutineScope()
    LaunchedEffect(key1 = action) {
        if(action != Action.NO_ACTION) {
            scope.launch {
                val snackBarResult = snackBarHostState.showSnackbar(
                    message = setMessage(
                        action = action,
                        taskTitle = taskTitle
                    ),
                    actionLabel = setActionLabel(action)
                )
                undoDeletedTask(
                    action = action,
                    snackBarResult = snackBarResult,
                    onUndoClicked = onUndoClicked
                )
            }
        }
    }
}

private fun setMessage(
    action: Action,
    taskTitle: String
): String {
    return when(action){
        Action.DELETE_ALL -> {
            "All Tasks Removed."
        }
        else -> {
            "${action.name}: $taskTitle"
        }
    }
}

private fun setActionLabel(action: Action): String {
    return if(action == Action.DELETE) {
        "UNDO"
    } else{
        "OK"
    }
}

private fun undoDeletedTask(
    action: Action,
    snackBarResult: SnackbarResult,
    onUndoClicked: (Action) -> Unit
) {
    if(snackBarResult == SnackbarResult.ActionPerformed && action == Action.DELETE) {
        onUndoClicked(Action.UNDO)
    }
}