package com.example.to_docompose.ui.screens.list;

import android.annotation.SuppressLint;
import androidx.compose.material.icons.Icons;
import androidx.compose.material3.ExperimentalMaterial3Api;
import androidx.compose.material3.SwipeToDismissBoxValue;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.tooling.preview.Preview;
import com.example.to_docompose.R;
import com.example.to_docompose.data.models.Priority;
import com.example.to_docompose.data.models.ToDoTask;
import com.example.to_docompose.util.Action;
import com.example.to_docompose.util.RequestState;
import com.example.to_docompose.util.SearchAppBarState;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000R\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a]\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\b2!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\f\u00a2\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00010\u000bH\u0007\u001a]\u0010\u0010\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\b2!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\f\u00a2\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00010\u000bH\u0007\u001a\u00a9\u0001\u0010\u0011\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00132\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00132\u0006\u0010\u0019\u001a\u00020\u001a2\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\b2!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\f\u00a2\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00010\u000bH\u0007\u001a\u0010\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u001dH\u0007\u001a3\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u00062!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\f\u00a2\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00010\u000bH\u0007\u001a\b\u0010 \u001a\u00020\u0001H\u0007\u00a8\u0006!"}, d2 = {"DisplayTasks", "", "modifier", "Landroidx/compose/ui/Modifier;", "tasks", "", "Lcom/example/to_docompose/data/models/ToDoTask;", "onSwipeToDelete", "Lkotlin/Function2;", "Lcom/example/to_docompose/util/Action;", "navigateToTaskScreen", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "taskId", "HandleListContent", "ListContent", "allTasks", "Lcom/example/to_docompose/util/RequestState;", "lowPriorityTasks", "highPriorityTasks", "sortState", "Lcom/example/to_docompose/data/models/Priority;", "searchedTasks", "searchAppBarState", "Lcom/example/to_docompose/util/SearchAppBarState;", "RedBackground", "degrees", "", "TaskItem", "toDoTask", "TaskItemPreview", "app_debug"})
public final class ListContentKt {
    
    @androidx.compose.runtime.Composable()
    public static final void ListContent(@org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull()
    com.example.to_docompose.util.RequestState<? extends java.util.List<com.example.to_docompose.data.models.ToDoTask>> allTasks, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.to_docompose.data.models.ToDoTask> lowPriorityTasks, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.to_docompose.data.models.ToDoTask> highPriorityTasks, @org.jetbrains.annotations.NotNull()
    com.example.to_docompose.util.RequestState<? extends com.example.to_docompose.data.models.Priority> sortState, @org.jetbrains.annotations.NotNull()
    com.example.to_docompose.util.RequestState<? extends java.util.List<com.example.to_docompose.data.models.ToDoTask>> searchedTasks, @org.jetbrains.annotations.NotNull()
    com.example.to_docompose.util.SearchAppBarState searchAppBarState, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super com.example.to_docompose.util.Action, ? super com.example.to_docompose.data.models.ToDoTask, kotlin.Unit> onSwipeToDelete, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> navigateToTaskScreen) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void HandleListContent(@org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.to_docompose.data.models.ToDoTask> tasks, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super com.example.to_docompose.util.Action, ? super com.example.to_docompose.data.models.ToDoTask, kotlin.Unit> onSwipeToDelete, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> navigateToTaskScreen) {
    }
    
    @android.annotation.SuppressLint(value = {"CoroutineCreationDuringComposition"})
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    @androidx.compose.runtime.Composable()
    public static final void DisplayTasks(@org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.to_docompose.data.models.ToDoTask> tasks, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super com.example.to_docompose.util.Action, ? super com.example.to_docompose.data.models.ToDoTask, kotlin.Unit> onSwipeToDelete, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> navigateToTaskScreen) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void RedBackground(float degrees) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void TaskItem(@org.jetbrains.annotations.NotNull()
    com.example.to_docompose.data.models.ToDoTask toDoTask, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> navigateToTaskScreen) {
    }
    
    @androidx.compose.runtime.Composable()
    @androidx.compose.ui.tooling.preview.Preview()
    public static final void TaskItemPreview() {
    }
}