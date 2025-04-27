package eu.rudiment.myrecipeapp

sealed class Screen (val route: String){
    object RecipeScreen:Screen("recipescreen")
    object CategoryDetailScreen:Screen("detailscreen")
}