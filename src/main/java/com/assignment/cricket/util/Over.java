package com.assignment.cricket.util;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class Over {
    private int overNumber;
    private List<Ball> balls;

}

