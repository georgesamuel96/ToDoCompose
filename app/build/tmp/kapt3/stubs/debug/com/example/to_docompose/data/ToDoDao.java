package com.example.to_docompose.data;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;
import com.example.to_docompose.data.models.ToDoTask;
import kotlinx.coroutines.flow.Flow;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\u0003H\u00a7@\u00a2\u0006\u0002\u0010\bJ\u0016\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f0\u000bH\'J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\'J\u001c\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f0\u000b2\u0006\u0010\u0011\u001a\u00020\u0012H\'J\u0014\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f0\u000bH\'J\u0014\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f0\u000bH\'J\u0016\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u0016"}, d2 = {"Lcom/example/to_docompose/data/ToDoDao;", "", "addTask", "", "toDoTask", "Lcom/example/to_docompose/data/models/ToDoTask;", "(Lcom/example/to_docompose/data/models/ToDoTask;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAllTasks", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteTask", "getAllTask", "Lkotlinx/coroutines/flow/Flow;", "", "getSelectedTask", "taskId", "", "searchDatabase", "searchQuery", "", "sortByHighPriority", "sortByLowPriority", "updateTask", "app_debug"})
@androidx.room.Dao()
public abstract interface ToDoDao {
    
    @androidx.room.Query(value = "select * from todo_table ORDER BY id ASC")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.example.to_docompose.data.models.ToDoTask>> getAllTask();
    
    @androidx.room.Query(value = "select * from todo_table WHERE id =:taskId")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.example.to_docompose.data.models.ToDoTask> getSelectedTask(int taskId);
    
    @androidx.room.Insert(onConflict = 5)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object addTask(@org.jetbrains.annotations.NotNull()
    com.example.to_docompose.data.models.ToDoTask toDoTask, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Update()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateTask(@org.jetbrains.annotations.NotNull()
    com.example.to_docompose.data.models.ToDoTask toDoTask, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Delete()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteTask(@org.jetbrains.annotations.NotNull()
    com.example.to_docompose.data.models.ToDoTask toDoTask, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "DELETE from todo_table")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteAllTasks(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM todo_table WHERE title LIKE :searchQuery OR description LIKE :searchQuery")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.example.to_docompose.data.models.ToDoTask>> searchDatabase(@org.jetbrains.annotations.NotNull()
    java.lang.String searchQuery);
    
    @androidx.room.Query(value = "SELECT * FROM todo_table ORDER BY CASE WHEN priority LIKE \'L%\' THEN 1 WHEN priority LIKE \'M%\' THEN 2 WHEN priority LIKE \'H%\' THEN 3 END")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.example.to_docompose.data.models.ToDoTask>> sortByLowPriority();
    
    @androidx.room.Query(value = "SELECT * FROM todo_table ORDER BY CASE WHEN priority LIKE \'H%\' THEN 1 WHEN priority LIKE \'M%\' THEN 2 WHEN priority LIKE \'L%\' THEN 3 END")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.example.to_docompose.data.models.ToDoTask>> sortByHighPriority();
}