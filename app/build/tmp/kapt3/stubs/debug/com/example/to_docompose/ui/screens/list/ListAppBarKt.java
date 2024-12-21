package com.example.to_docompose.ui.screens.list;

import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.icons.Icons;
import androidx.compose.material3.ExperimentalMaterial3Api;
import androidx.compose.material3.TopAppBarDefaults;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.tooling.preview.Preview;
import com.example.to_docompose.R;
import com.example.to_docompose.data.models.Priority;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.ImeAction;
import com.example.to_docompose.ui.viewmodels.SharedViewModel;
import com.example.to_docompose.util.Action;
import com.example.to_docompose.util.SearchAppBarState;
import com.example.to_docompose.util.TrailingIconState;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u001a8\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0007\u001a\b\u0010\b\u001a\u00020\u0001H\u0007\u001a\u0016\u0010\t\u001a\u00020\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0007\u001a \u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007\u001a8\u0010\u0012\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0007\u001a\u0016\u0010\u0013\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0007\u001aF\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00112\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u0005H\u0007\u001a\b\u0010\u0018\u001a\u00020\u0001H\u0007\u001a\u001c\u0010\u0019\u001a\u00020\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u0007\u00a8\u0006\u001a"}, d2 = {"DefaultListAppBar", "", "onSearchClicked", "Lkotlin/Function0;", "onSortClicked", "Lkotlin/Function1;", "Lcom/example/to_docompose/data/models/Priority;", "onDeleteAllConfirmed", "DefaultListAppBarPreview", "DeleteAction", "onDeleteAllClicked", "ListAppBar", "sharedViewModel", "Lcom/example/to_docompose/ui/viewmodels/SharedViewModel;", "searchAppBarState", "Lcom/example/to_docompose/util/SearchAppBarState;", "searchTextState", "", "ListAppBarActions", "SearchAction", "SearchAppBar", "text", "onTextChange", "onCloseCloseClicked", "SearchAppBarPreview", "SortAction", "app_debug"})
public final class ListAppBarKt {
    
    @androidx.compose.runtime.Composable()
    public static final void ListAppBar(@org.jetbrains.annotations.NotNull()
    com.example.to_docompose.ui.viewmodels.SharedViewModel sharedViewModel, @org.jetbrains.annotations.NotNull()
    com.example.to_docompose.util.SearchAppBarState searchAppBarState, @org.jetbrains.annotations.NotNull()
    java.lang.String searchTextState) {
    }
    
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    @androidx.compose.runtime.Composable()
    public static final void DefaultListAppBar(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onSearchClicked, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.to_docompose.data.models.Priority, kotlin.Unit> onSortClicked, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onDeleteAllConfirmed) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void ListAppBarActions(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onSearchClicked, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.to_docompose.data.models.Priority, kotlin.Unit> onSortClicked, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onDeleteAllConfirmed) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void SearchAction(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onSearchClicked) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void SortAction(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.to_docompose.data.models.Priority, kotlin.Unit> onSortClicked) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void DeleteAction(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onDeleteAllClicked) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void SearchAppBar(@org.jetbrains.annotations.NotNull()
    java.lang.String text, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onTextChange, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onCloseCloseClicked, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onSearchClicked) {
    }
    
    @androidx.compose.runtime.Composable()
    @androidx.compose.ui.tooling.preview.Preview()
    public static final void DefaultListAppBarPreview() {
    }
    
    @androidx.compose.runtime.Composable()
    @androidx.compose.ui.tooling.preview.Preview()
    public static final void SearchAppBarPreview() {
    }
}