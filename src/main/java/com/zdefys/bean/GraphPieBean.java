package com.zdefys.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: zdefys
 * @date: 2020/5/16 18:02
 * @version: v1.0
 * @description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GraphPieBean implements Comparable<GraphPieBean>{
    private String name;
    private int value;


    @Override
    public int compareTo(GraphPieBean o) {
        return this.getValue() - o.getValue();
    }
}
