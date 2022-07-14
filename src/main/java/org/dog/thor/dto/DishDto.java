package org.dog.thor.dto;

import lombok.Data;
import org.dog.thor.entity.Dish;
import org.dog.thor.entity.DishFlavor;

import java.util.ArrayList;
import java.util.List;

@Data
public class DishDto extends Dish {

    private List<DishFlavor> flavors = new ArrayList<>();

    private String categoryName;

    private Integer copies;
}
