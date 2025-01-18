package com.hmdp.dto;

import lombok.Data;

import java.util.List;

/**
 * @author 裴迪
 */
@Data
public class ScrollResult {
    private List<?> list;
    private Long minTime;
    private Integer offset;
}
