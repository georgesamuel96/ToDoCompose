package com.example.to_docompose.util;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/example/to_docompose/util/Constants;", "", "()V", "DATABASE_NAME", "", "DATABASE_TABLE", "LIST_ARGUMENT_KEY", "LIST_SCREEN", "MAX_TITLE_LENGTH", "", "PREFERENCE_KEY", "PREFERENCE_NAME", "SPLASH_SCREEN", "SPLASH_SCREEN_DELAY", "", "TASK_ARGUMENT_KEY", "TASK_SCREEN", "app_debug"})
public final class Constants {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DATABASE_TABLE = "todo_table";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DATABASE_NAME = "todo_database";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SPLASH_SCREEN = "splash";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LIST_SCREEN = "list/{action}";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TASK_SCREEN = "task/{taskId}";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LIST_ARGUMENT_KEY = "action";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TASK_ARGUMENT_KEY = "taskId";
    public static final int MAX_TITLE_LENGTH = 20;
    public static final long SPLASH_SCREEN_DELAY = 3000L;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PREFERENCE_NAME = "todo_preferences";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PREFERENCE_KEY = "sort_state";
    @org.jetbrains.annotations.NotNull()
    public static final com.example.to_docompose.util.Constants INSTANCE = null;
    
    private Constants() {
        super();
    }
}