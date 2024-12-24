package com.example.to_docompose.ui.screens.list

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.to_docompose.R
import com.example.to_docompose.data.models.Priority
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.ImeAction
import com.example.to_docompose.components.DisplayAlertDialog
import com.example.to_docompose.components.PriorityItem
import com.example.to_docompose.ui.theme.LARGE_PADDING
import com.example.to_docompose.ui.theme.MEDIUM_PADDING
import com.example.to_docompose.ui.theme.TOP_APP_BAR_HEIGHT
import com.example.to_docompose.ui.viewmodels.SharedViewModel
import com.example.to_docompose.util.Action
import com.example.to_docompose.util.SearchAppBarState

@Composable
fun ListAppBar(
    sharedViewModel: SharedViewModel,
    searchAppBarState: SearchAppBarState,
    searchTextState: String
) {
    when (searchAppBarState) {
        SearchAppBarState.CLOSED -> {
            DefaultListAppBar(
                onSearchClicked = {
                    sharedViewModel.updateAppBarState(SearchAppBarState.OPEN)

                },
                onSortClicked = {
                    sharedViewModel.persisSortingState(it)
                },
                onDeleteAllConfirmed = {
                    sharedViewModel.updateAction(Action.DELETE_ALL)
                }
            )
        }

        else -> {
            SearchAppBar(
                text = searchTextState,
                onSearchClicked = {
                    sharedViewModel.searchDatabase(searchQuery = it)
                },
                onCloseCloseClicked = {
                    sharedViewModel.updateAppBarState(SearchAppBarState.CLOSED)
                    sharedViewModel.updateSearchText("")
                },
                onTextChange = { newText ->
                    sharedViewModel.updateSearchText(newText)
                }
            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DefaultListAppBar(
    onSearchClicked: () -> Unit,
    onSortClicked: (Priority) -> Unit,
    onDeleteAllConfirmed: () -> Unit,
) {
    TopAppBar(
        title = {
            Text(stringResource(R.string.list_screnn_title), color = MaterialTheme.colorScheme.onPrimary)
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.primary
        ),
        actions = {
            ListAppBarActions(onSearchClicked, onSortClicked, onDeleteAllConfirmed)
        }
    )
}

@Composable
fun ListAppBarActions(
    onSearchClicked: () -> Unit,
    onSortClicked: (Priority) -> Unit,
    onDeleteAllConfirmed: () -> Unit,
) {
    var openDialog by remember {
        mutableStateOf(false)
    }

    DisplayAlertDialog(
        title = stringResource(R.string.delete_all_tasks),
        message = stringResource(R.string.delete_all_tasks_confirmation),
        openDialog = openDialog,
        closeDialog = {
            openDialog = false
        },
        onYesClicked = {
            onDeleteAllConfirmed()
        }
    )
    SearchAction(onSearchClicked)
    SortAction(onSortClicked)
    DeleteAction(onDeleteAllClicked = { openDialog = true })
}


@Composable
fun SearchAction(onSearchClicked: () -> Unit) {
    IconButton(onClick = onSearchClicked) {
        Icon(
            imageVector = Icons.Filled.Search,
            contentDescription = stringResource(R.string.search_action),
            tint = MaterialTheme.colorScheme.onPrimary
        )
    }

}

@Composable
fun SortAction(onSortClicked: (Priority) -> Unit) {
    var expanded by remember { mutableStateOf(false) }

    IconButton(onClick = {
        expanded = true
    }) {
        Icon(
            painter = painterResource(id = R.drawable.ic_filter_list),
            contentDescription = stringResource(R.string.sort_action),
            tint = MaterialTheme.colorScheme.onPrimary
        )
        DropdownMenu(
            expanded = expanded,
            onDismissRequest = {
                expanded = false
            }
        ) {
            Priority.entries.toTypedArray().slice(setOf(0,2,3)).forEach {
                DropdownMenuItem(onClick = {
                    expanded = false
                    onSortClicked(it)
                },
                    text = {
                        PriorityItem(it)
                    }
                )
            }
        }
    }
}

@Composable
fun DeleteAction(
    onDeleteAllClicked: () -> Unit
) {
    var expanded by remember { mutableStateOf(false) }

    IconButton(onClick = {
        expanded = true
    }) {
        Icon(
            painter = painterResource(id = R.drawable.ic_vertical_menu),
            contentDescription = stringResource(R.string.delete_all_action),
            tint = MaterialTheme.colorScheme.onPrimary
        )
        DropdownMenu(
            expanded = expanded,
            onDismissRequest = {
                expanded = false
            }
        ) {
            DropdownMenuItem(onClick = {
                expanded = false
                onDeleteAllClicked()
            },
                text = {
                    Text(
                        modifier = Modifier
                            .padding(start = LARGE_PADDING),
                        text = stringResource(R.string.delete_all_action),
                        style = MaterialTheme.typography.titleMedium,
                        color = MaterialTheme.colorScheme.onSurface
                    )
                }
            )
        }
    }
}

@Composable
fun SearchAppBar(
    text: String,
    onTextChange: (String) -> Unit,
    onCloseCloseClicked: () -> Unit,
    onSearchClicked: (String) -> Unit
) {

    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .height(TOP_APP_BAR_HEIGHT),
        shadowElevation = MEDIUM_PADDING,
    ) {
        TextField(
            modifier = Modifier.fillMaxWidth(),
            value = text, onValueChange = {
                onTextChange(it)
            },
            placeholder = {
                Text(
                    modifier = Modifier
                        .alpha(0.5f),
                    text = stringResource(R.string.search_placeholder),
                    color = Color.White,
                )
            },
            textStyle = TextStyle(
                fontSize = MaterialTheme.typography.bodyMedium.fontSize,
            ),
            singleLine = true,
            leadingIcon = {
                IconButton(
                    modifier = Modifier.alpha(0.38f),
                    onClick = {}
                ) {
                    Icon(
                        imageVector = Icons.Filled.Search,
                        contentDescription = stringResource(R.string.search_icon),
                    )
                }
            },
            trailingIcon = {
                IconButton(
                    onClick = {
                        if(text.isNotEmpty()) {
                            onTextChange("")
                        } else {
                            onCloseCloseClicked()
                        }
                    }
                ) {
                    Icon(
                        imageVector = Icons.Filled.Close,
                        contentDescription = stringResource(R.string.close_icon),
                    )
                }
            },
            keyboardOptions = KeyboardOptions(
                imeAction = ImeAction.Search
            ),
            keyboardActions = KeyboardActions(
                onSearch = {
                    onSearchClicked(text)
                }
            )
        )
    }
}

@Composable
@Preview
fun DefaultListAppBarPreview() {
    DefaultListAppBar(
        onSearchClicked = {},
        onSortClicked = {},
        onDeleteAllConfirmed = {}
    )
}

@Composable
@Preview
fun SearchAppBarPreview() {
    SearchAppBar(
        text = "",
        onSearchClicked = {},
        onCloseCloseClicked = {},
        onTextChange = {}
    )
}