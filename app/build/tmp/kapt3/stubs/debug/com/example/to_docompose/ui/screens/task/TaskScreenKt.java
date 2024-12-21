package com.example.to_docompose.ui.screens.task;

import android.content.Context;
import android.widget.Toast;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.compose.LocalOnBackPressedDispatcherOwner;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Modifier;
import com.example.to_docompose.data.models.ToDoTask;
import com.example.to_docompose.ui.viewmodels.SharedViewModel;
import com.example.to_docompose.util.Action;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0000\u001a\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007\u001a.\u0010\u0006\u001a\u00020\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\fH\u0007\u001a\u000e\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0010\u00a8\u0006\u0011"}, d2 = {"BackHandler", "", "backDispatcher", "Landroidx/activity/OnBackPressedDispatcher;", "onBackPressed", "Lkotlin/Function0;", "TaskScreen", "selectedTask", "Lcom/example/to_docompose/data/models/ToDoTask;", "sharedViewModel", "Lcom/example/to_docompose/ui/viewmodels/SharedViewModel;", "navigateToListScreen", "Lkotlin/Function1;", "Lcom/example/to_docompose/util/Action;", "displayToast", "context", "Landroid/content/Context;", "app_debug"})
public final class TaskScreenKt {
    
    @androidx.compose.runtime.Composable()
    public static final void TaskScreen(@org.jetbrains.annotations.Nullable()
    com.example.to_docompose.data.models.ToDoTask selectedTask, @org.jetbrains.annotations.NotNull()
    com.example.to_docompose.ui.viewmodels.SharedViewModel sharedViewModel, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.to_docompose.util.Action, kotlin.Unit> navigateToListScreen) {
    }
    
    public static final void displayToast(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void BackHandler(@org.jetbrains.annotations.Nullable()
    androidx.activity.OnBackPressedDispatcher backDispatcher, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onBackPressed) {
    }
}