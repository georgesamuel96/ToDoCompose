package com.example.to_docompose.data.repositories;

import com.example.to_docompose.data.ToDoDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("dagger.hilt.android.scopes.ViewModelScoped")
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast"
})
public final class TodoRepository_Factory implements Factory<TodoRepository> {
  private final Provider<ToDoDao> toDoDaoProvider;

  public TodoRepository_Factory(Provider<ToDoDao> toDoDaoProvider) {
    this.toDoDaoProvider = toDoDaoProvider;
  }

  @Override
  public TodoRepository get() {
    return newInstance(toDoDaoProvider.get());
  }

  public static TodoRepository_Factory create(Provider<ToDoDao> toDoDaoProvider) {
    return new TodoRepository_Factory(toDoDaoProvider);
  }

  public static TodoRepository newInstance(ToDoDao toDoDao) {
    return new TodoRepository(toDoDao);
  }
}
