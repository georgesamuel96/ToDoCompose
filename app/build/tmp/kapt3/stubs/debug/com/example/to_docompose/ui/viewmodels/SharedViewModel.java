package com.example.to_docompose.ui.viewmodels;

import androidx.compose.runtime.MutableState;
import androidx.lifecycle.ViewModel;
import com.example.to_docompose.data.models.Priority;
import com.example.to_docompose.data.models.ToDoTask;
import com.example.to_docompose.data.repositories.DataStoreRepository;
import com.example.to_docompose.data.repositories.TodoRepository;
import com.example.to_docompose.util.Action;
import com.example.to_docompose.util.RequestState;
import com.example.to_docompose.util.SearchAppBarState;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u00104\u001a\u000205H\u0002J\b\u00106\u001a\u000205H\u0002J\b\u00107\u001a\u000205H\u0002J\u0006\u0010\u0019\u001a\u000205J\u000e\u0010/\u001a\u0002052\u0006\u00108\u001a\u00020!J\u000e\u00109\u001a\u0002052\u0006\u0010\u0010\u001a\u00020\u0012J\u000e\u0010:\u001a\u0002052\u0006\u0010%\u001a\u00020\u000fJ\u0006\u0010;\u001a\u000205J\u000e\u0010<\u001a\u0002052\u0006\u0010=\u001a\u00020\u001cJ\b\u0010>\u001a\u000205H\u0002J\u0010\u0010?\u001a\u0002052\b\u0010.\u001a\u0004\u0018\u00010\u000bJ\u000e\u0010@\u001a\u0002052\u0006\u0010A\u001a\u00020\u001cJ\u0006\u0010B\u001a\u00020CR \u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R#\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u001d\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0014R\u001d\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001aR\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\'\u001a\b\u0012\u0004\u0012\u00020(0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0014R\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0014R#\u0010,\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001aR\u0019\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001aR\u001d\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\t0\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001aR\u0017\u00102\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010\u0014\u00a8\u0006D"}, d2 = {"Lcom/example/to_docompose/ui/viewmodels/SharedViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/to_docompose/data/repositories/TodoRepository;", "dataStoreRepository", "Lcom/example/to_docompose/data/repositories/DataStoreRepository;", "(Lcom/example/to_docompose/data/repositories/TodoRepository;Lcom/example/to_docompose/data/repositories/DataStoreRepository;)V", "_allTasks", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/example/to_docompose/util/RequestState;", "", "Lcom/example/to_docompose/data/models/ToDoTask;", "_searchedTasks", "_selectedTask", "_sortState", "Lcom/example/to_docompose/data/models/Priority;", "action", "Landroidx/compose/runtime/MutableState;", "Lcom/example/to_docompose/util/Action;", "getAction", "()Landroidx/compose/runtime/MutableState;", "setAction", "(Landroidx/compose/runtime/MutableState;)V", "allTasks", "Lkotlinx/coroutines/flow/StateFlow;", "getAllTasks", "()Lkotlinx/coroutines/flow/StateFlow;", "description", "", "getDescription", "highPriorityTasks", "getHighPriorityTasks", "id", "", "getId", "lowPriorityTasks", "getLowPriorityTasks", "priority", "getPriority", "searchAppBarState", "Lcom/example/to_docompose/util/SearchAppBarState;", "getSearchAppBarState", "searchTextState", "getSearchTextState", "searchedTasks", "getSearchedTasks", "selectedTask", "getSelectedTask", "sortState", "getSortState", "title", "getTitle", "addTask", "", "deleteAllTasks", "deleteTask", "taskId", "handleDatabaseActions", "persisSortingState", "readSortState", "searchDatabase", "searchQuery", "updateTask", "updateTaskFields", "updateTitle", "newTitle", "validateFields", "", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class SharedViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.to_docompose.data.repositories.TodoRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.to_docompose.data.repositories.DataStoreRepository dataStoreRepository = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.compose.runtime.MutableState<com.example.to_docompose.util.Action> action;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState<java.lang.Integer> id = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState<java.lang.String> title = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState<java.lang.String> description = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState<com.example.to_docompose.data.models.Priority> priority = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState<com.example.to_docompose.util.SearchAppBarState> searchAppBarState = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState<java.lang.String> searchTextState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.to_docompose.util.RequestState<java.util.List<com.example.to_docompose.data.models.ToDoTask>>> _allTasks = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.example.to_docompose.util.RequestState<java.util.List<com.example.to_docompose.data.models.ToDoTask>>> allTasks = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.to_docompose.data.models.ToDoTask> _selectedTask = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.example.to_docompose.data.models.ToDoTask> selectedTask = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.to_docompose.util.RequestState<java.util.List<com.example.to_docompose.data.models.ToDoTask>>> _searchedTasks = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.example.to_docompose.util.RequestState<java.util.List<com.example.to_docompose.data.models.ToDoTask>>> searchedTasks = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.to_docompose.util.RequestState<com.example.to_docompose.data.models.Priority>> _sortState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.example.to_docompose.util.RequestState<com.example.to_docompose.data.models.Priority>> sortState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.example.to_docompose.data.models.ToDoTask>> lowPriorityTasks = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.example.to_docompose.data.models.ToDoTask>> highPriorityTasks = null;
    
    @javax.inject.Inject()
    public SharedViewModel(@org.jetbrains.annotations.NotNull()
    com.example.to_docompose.data.repositories.TodoRepository repository, @org.jetbrains.annotations.NotNull()
    com.example.to_docompose.data.repositories.DataStoreRepository dataStoreRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.MutableState<com.example.to_docompose.util.Action> getAction() {
        return null;
    }
    
    public final void setAction(@org.jetbrains.annotations.NotNull()
    androidx.compose.runtime.MutableState<com.example.to_docompose.util.Action> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.MutableState<java.lang.Integer> getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.MutableState<java.lang.String> getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.MutableState<java.lang.String> getDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.MutableState<com.example.to_docompose.data.models.Priority> getPriority() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.MutableState<com.example.to_docompose.util.SearchAppBarState> getSearchAppBarState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.MutableState<java.lang.String> getSearchTextState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.example.to_docompose.util.RequestState<java.util.List<com.example.to_docompose.data.models.ToDoTask>>> getAllTasks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.example.to_docompose.data.models.ToDoTask> getSelectedTask() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.example.to_docompose.util.RequestState<java.util.List<com.example.to_docompose.data.models.ToDoTask>>> getSearchedTasks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.example.to_docompose.util.RequestState<com.example.to_docompose.data.models.Priority>> getSortState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.example.to_docompose.data.models.ToDoTask>> getLowPriorityTasks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.example.to_docompose.data.models.ToDoTask>> getHighPriorityTasks() {
        return null;
    }
    
    public final void searchDatabase(@org.jetbrains.annotations.NotNull()
    java.lang.String searchQuery) {
    }
    
    public final void persisSortingState(@org.jetbrains.annotations.NotNull()
    com.example.to_docompose.data.models.Priority priority) {
    }
    
    public final void readSortState() {
    }
    
    public final void getAllTasks() {
    }
    
    public final void getSelectedTask(int taskId) {
    }
    
    private final void addTask() {
    }
    
    private final void updateTask() {
    }
    
    private final void deleteTask() {
    }
    
    private final void deleteAllTasks() {
    }
    
    public final void handleDatabaseActions(@org.jetbrains.annotations.NotNull()
    com.example.to_docompose.util.Action action) {
    }
    
    public final void updateTaskFields(@org.jetbrains.annotations.Nullable()
    com.example.to_docompose.data.models.ToDoTask selectedTask) {
    }
    
    public final void updateTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String newTitle) {
    }
    
    public final boolean validateFields() {
        return false;
    }
}