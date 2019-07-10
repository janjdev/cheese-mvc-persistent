package org.launchcode.models.forms;

import org.launchcode.models.Cheese;
import org.launchcode.models.Menu;

import javax.validation.constraints.NotNull;

public class AddMenuItemForm {

   @NotNull
    private int menuId;

    @NotNull
    private  int cheeseId;

    private Menu menu;

    private Iterable<Cheese> cheeses;
    //Getters and Setters

    public Menu getMenu() { return menu;    }
    public void setMenu(Menu menu) { this.menu = menu; }

    public Iterable<Cheese> getCheeses() { return cheeses; }
    public void setCheeses(Iterable<Cheese> cheeses) {
        this.cheeses = cheeses;
    }

    //Empty constructor
    public AddMenuItemForm() {}
    //Constructor
    public  AddMenuItemForm(Iterable<Cheese> cheeses, Menu menu){
        this.cheeses = cheeses;
        this.menu = menu;
    }

    public int getMenuId() { return menuId;   }
    public void setMenuId(int menuId){this.menuId = menuId;}

    public int getCheeseId() { return cheeseId; }
    public void setCheeseId(int cheeseId) {
        this.cheeseId = cheeseId;
    }









}
