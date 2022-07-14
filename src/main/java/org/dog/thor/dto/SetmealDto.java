package org.dog.thor.dto;

import lombok.Data;
import org.dog.thor.entity.Setmeal;
import org.dog.thor.entity.SetmealDish;

import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
