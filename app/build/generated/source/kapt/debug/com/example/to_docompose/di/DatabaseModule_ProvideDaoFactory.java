package com.example.to_docompose.di;

import com.example.to_docompose.data.ToDoDao;
import com.example.to_docompose.data.ToDoDatabase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
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
public final class DatabaseModule_ProvideDaoFactory implements Factory<ToDoDao> {
  private final Provider<ToDoDatabase> toDoDatabaseProvider;

  public DatabaseModule_ProvideDaoFactory(Provider<ToDoDatabase> toDoDatabaseProvider) {
    this.toDoDatabaseProvider = toDoDatabaseProvider;
  }

  @Override
  public ToDoDao get() {
    return provideDao(toDoDatabaseProvider.get());
  }

  public static DatabaseModule_ProvideDaoFactory create(
      Provider<ToDoDatabase> toDoDatabaseProvider) {
    return new DatabaseModule_ProvideDaoFactory(toDoDatabaseProvider);
  }

  public static ToDoDao provideDao(ToDoDatabase toDoDatabase) {
    return Preconditions.checkNotNullFromProvides(DatabaseModule.INSTANCE.provideDao(toDoDatabase));
  }
}
