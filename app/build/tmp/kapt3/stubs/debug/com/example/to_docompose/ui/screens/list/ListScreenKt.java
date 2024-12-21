package com.example.to_docompose.ui.screens.list;

import androidx.compose.material.icons.Icons;
import androidx.compose.material3.SnackbarHostState;
import androidx.compose.material3.SnackbarResult;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Modifier;
import com.example.to_docompose.R;
import com.example.to_docompose.ui.viewmodels.SharedViewModel;
import com.example.to_docompose.util.Action;
import com.example.to_docompose.util.SearchAppBarState;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001aH\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0006H\u0007\u001a+\u0010\u000b\u001a\u00020\u00012!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\r\u00a2\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00010\u0005H\u0007\u001a,\u0010\u0011\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00062\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\u0013\u001a\u00020\u0014H\u0007\u001a\u0010\u0010\u0015\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0006H\u0002\u001a\u0018\u0010\u0016\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0002\u001a,\u0010\u0017\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00192\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u0002\u00a8\u0006\u001a"}, d2 = {"DisplaySnackBar", "", "snackBarHostState", "Landroidx/compose/material3/SnackbarHostState;", "onComplete", "Lkotlin/Function1;", "Lcom/example/to_docompose/util/Action;", "onUndoClicked", "taskTitle", "", "action", "ListFab", "onFabClicked", "", "Lkotlin/ParameterName;", "name", "taskId", "ListScreen", "navigateToTaskScreen", "sharedViewModel", "Lcom/example/to_docompose/ui/viewmodels/SharedViewModel;", "setActionLabel", "setMessage", "undoDeletedTask", "snackBarResult", "Landroidx/compose/material3/SnackbarResult;", "app_debug"})
public final class ListScreenKt {
    
    @androidx.compose.runtime.Composable()
    public static final void ListScreen(@org.jetbrains.annotations.NotNull()
    com.example.to_docompose.util.Action action, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> navigateToTaskScreen, @org.jetbrains.annotations.NotNull()
    com.example.to_docompose.ui.viewmodels.SharedViewModel sharedViewModel) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void ListFab(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onFabClicked) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void DisplaySnackBar(@org.jetbrains.annotations.NotNull()
    androidx.compose.material3.SnackbarHostState snackBarHostState, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.to_docompose.util.Action, kotlin.Unit> onComplete, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.to_docompose.util.Action, kotlin.Unit> onUndoClicked, @org.jetbrains.annotations.NotNull()
    java.lang.String taskTitle, @org.jetbrains.annotations.NotNull()
    com.example.to_docompose.util.Action action) {
    }
    
    private static final java.lang.String setMessage(com.example.to_docompose.util.Action action, java.lang.String taskTitle) {
        return null;
    }
    
    private static final java.lang.String setActionLabel(com.example.to_docompose.util.Action action) {
        return null;
    }
    
    private static final void undoDeletedTask(com.example.to_docompose.util.Action action, androidx.compose.material3.SnackbarResult snackBarResult, kotlin.jvm.functions.Function1<? super com.example.to_docompose.util.Action, kotlin.Unit> onUndoClicked) {
    }
}