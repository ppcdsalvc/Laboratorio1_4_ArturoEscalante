package com.gnirt69.recyclerviewoptionmenu;

/**
 * Created by NgocTri on 11/5/2016.
 */

public class RecyclerItem {

    private String title;
    private String description;
    private String descrp3;

    public RecyclerItem(String title, String description,String tercero) {
        this.title = title;
        this.description = description;
        this.descrp3 = tercero;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescrp3(){
        return descrp3;
    }

    public void setDescrp3(String descrp3){
        this.descrp3=descrp3;
    }
}
