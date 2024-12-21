package com.example.to_docompose.ui.screens.task;

import androidx.compose.material.icons.Icons;
import androidx.compose.material3.ExperimentalMaterial3Api;
import androidx.compose.material3.TopAppBarDefaults;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.tooling.preview.Preview;
import com.example.to_docompose.R;
import com.example.to_docompose.data.models.Priority;
import com.example.to_docompose.data.models.ToDoTask;
import com.example.to_docompose.util.Action;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u001c\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003H\u0007\u001a\u001c\u0010\u0005\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003H\u0007\u001a\u001c\u0010\u0007\u001a\u00020\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003H\u0007\u001a\u0016\u0010\t\u001a\u00020\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0007\u001a$\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003H\u0007\u001a$\u0010\u0010\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003H\u0007\u001a\b\u0010\u0011\u001a\u00020\u0001H\u0007\u001a\u001c\u0010\u0012\u001a\u00020\u00012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003H\u0007\u001a\b\u0010\u0013\u001a\u00020\u0001H\u0007\u001a&\u0010\u0014\u001a\u00020\u00012\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003H\u0007\u001a\u001c\u0010\u0015\u001a\u00020\u00012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003H\u0007\u00a8\u0006\u0017"}, d2 = {"AddAction", "", "onAddClicked", "Lkotlin/Function1;", "Lcom/example/to_docompose/util/Action;", "BackAction", "onBackClicked", "CloseAction", "onCLoseClicked", "DeleteAction", "onDeleteClicked", "Lkotlin/Function0;", "ExistingTaskAppBar", "selectedTask", "Lcom/example/to_docompose/data/models/ToDoTask;", "navigateToListScreen", "ExistingTaskAppBarActions", "ExistingTaskAppBarPreview", "NewTaskAppBar", "NewTaskAppBarPreview", "TaskAppBar", "UpdateAction", "onUpdateClicked", "app_debug"})
public final class TaskAppBarKt {
    
    @androidx.compose.runtime.Composable()
    public static final void TaskAppBar(@org.jetbrains.annotations.Nullable()
    com.example.to_docompose.data.models.ToDoTask selectedTask, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.to_docompose.util.Action, kotlin.Unit> navigateToListScreen) {
    }
    
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    @androidx.compose.runtime.Composable()
    public static final void NewTaskAppBar(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.to_docompose.util.Action, kotlin.Unit> navigateToListScreen) {
    }
    
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    @androidx.compose.runtime.Composable()
    public static final void ExistingTaskAppBar(@org.jetbrains.annotations.NotNull()
    com.example.to_docompose.data.models.ToDoTask selectedTask, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.to_docompose.util.Action, kotlin.Unit> navigateToListScreen) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void ExistingTaskAppBarActions(@org.jetbrains.annotations.NotNull()
    com.example.to_docompose.data.models.ToDoTask selectedTask, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.to_docompose.util.Action, kotlin.Unit> navigateToListScreen) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void CloseAction(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.to_docompose.util.Action, kotlin.Unit> onCLoseClicked) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void DeleteAction(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onDeleteClicked) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void UpdateAction(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.to_docompose.util.Action, kotlin.Unit> onUpdateClicked) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void BackAction(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.to_docompose.util.Action, kotlin.Unit> onBackClicked) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void AddAction(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.to_docompose.util.Action, kotlin.Unit> onAddClicked) {
    }
    
    @androidx.compose.runtime.Composable()
    @androidx.compose.ui.tooling.preview.Preview()
    public static final void NewTaskAppBarPreview() {
    }
    
    @androidx.compose.runtime.Composable()
    @androidx.compose.ui.tooling.preview.Preview()
    public static final void ExistingTaskAppBarPreview() {
    }
}