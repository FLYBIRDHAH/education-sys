package com.wlj.collegesystem.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class College {
    private Long id;
    /**
     * 不能为空，就是不能为零吧，就设了个最小值为1
     */
    @DecimalMin(value = "1",message = "{college.no.notZero}")
    private int no;
    private String name;
    private Short isDelete;
    private Date creationTime;
    private Date modificationTime;
}
