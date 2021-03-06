package com.example.demo.service;

import com.example.demo.dto.DepartmentDTO;
import com.example.demo.dto.PositionDTO;
import com.example.demo.dto.QueryDTO;
import com.example.demo.entity.Department;
import com.example.demo.entity.Position;
import com.example.demo.util.Result;
import org.apache.poi.ss.formula.functions.T;

/**
 * @author 咲蛍
 * @date 2021/6/26
 */
public interface DepartmentService {
    /**
     * 分页查询
     *
     * @param queryDTO queryDTO
     * @return Result
     */
    Result<T> selectDepartmentPage(QueryDTO queryDTO);

    /**
     * 添加部门
     *
     * @param token         token
     * @param departmentDTO departmentDTO
     * @return Result
     */
    Result<T> addDepartment(String token, DepartmentDTO departmentDTO);

    /**
     * 通过部门id查询其下岗位
     *
     * @param departmentId 部门id
     * @return Result
     */
    Result<T> selectPosition(Integer departmentId);

    /**
     * 部门删除
     *
     * @param departmentId 部门id
     * @param token        token
     * @return Result
     */
    Result<T> deleteDepartment(String token, Integer departmentId);

    /**
     * 添加岗位
     *
     * @param token       token
     * @param positionDTO positionDTO
     * @return Result
     */
    Result<T> addPosition(String token, PositionDTO positionDTO);

    /**
     * 岗位删除
     *
     * @param token      token
     * @param positionId 岗位id
     * @return Result
     */
    Result<T> deletePosition(String token, Integer positionId);

    /**
     * 岗位列表
     *
     * @return Result
     */
    Result<T> positionList();

    /**
     * 部门查询
     *
     * @param departmentDTO departmentDTO
     * @return Department
     */
    Department selectDepartment(DepartmentDTO departmentDTO);

    /**
     * 部门插入
     *
     * @param departmentDTO departmentDTO
     * @return insertDepartment
     */
    Department insertDepartment(DepartmentDTO departmentDTO);

    /**
     * 岗位插入
     *
     * @param positionDTO positionDTO
     * @return Position
     */
    Position insertPosition(PositionDTO positionDTO);
}
