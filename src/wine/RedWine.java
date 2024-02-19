/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wine;

/**
 *
 * @author dzaka
 */

public class RedWine extends Wine {
    private String name;
    private String origin;

    public RedWine(String name, String origin) {
        this.name = name;
        this.origin = origin;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getOrigin() {
        return origin;
    }
}
