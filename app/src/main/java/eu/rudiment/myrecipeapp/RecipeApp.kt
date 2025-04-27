package eu.rudiment.myrecipeapp

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun RecipeApp(navController: NavHostController){
    val recipeViewModel: MainViewModel = viewModel()
    val viewState by recipeViewModel.categoriesState

    NavHost(navController = navController, startDestination = Screen.RecipeScreen.route){
        composable(route = Screen.RecipeScreen.route){
            RecipeScreen(viewstate = viewState, navigateToDetail = {
                navController.currentBackStackEntry?.savedStateHandle?.set("cat", it)
                navController.navigate(Screen.CategoryDetailScreen.route)
            })
        }
        composable(route = Screen.CategoryDetailScreen.route){
            val category = navController.previousBackStackEntry?.savedStateHandle?.get<Category>("cat")?:
            Category("", "", "", "")
            CategoryDetailScreen(category = category)
        }
    }
}