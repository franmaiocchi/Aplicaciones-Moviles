package com.fm.primerparcial;

public class Articulo
{
    private String articulo;
    private Integer icon;

    public Articulo(String articulo, Integer icon)
    {
        this.articulo = articulo;
        this.icon = icon;
    }
    public String getArticulo()
    {
        return this.articulo;
    }
    public Integer getIcon()
    {
        return this.icon;
    }
}
