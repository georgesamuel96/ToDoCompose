package com.example.to_docompose.di;

import android.content.Context;
import com.example.to_docompose.data.ToDoDatabase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
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
public final class DatabaseModule_ProvideDatabaseFactory implements Factory<ToDoDatabase> {
  private final Provider<Context> contextProvider;

  public DatabaseModule_ProvideDatabaseFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public ToDoDatabase get() {
    return provideDatabase(contextProvider.get());
  }

  public static DatabaseModule_ProvideDatabaseFactory create(Provider<Context> contextProvider) {
    return new DatabaseModule_ProvideDatabaseFactory(contextProvider);
  }

  public static ToDoDatabase provideDatabase(Context context) {
    return Preconditions.checkNotNullFromProvides(DatabaseModule.INSTANCE.provideDatabase(context));
  }
}
