package com.example.demo.service;

import com.example.demo.dto.*;
import com.example.demo.util.Result;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;

/**
 *
 * @author 涼月
 * @date 2021/05/17
 */
public interface PerformanceService {
    /**
     * 添加绩效
     * @param token 用户token
     * @param performanceDTO 绩效DTO
     * @return Result
     * @throws ParseException 报错
     */
    Result addPerformance(String token,PerformanceDTO performanceDTO) throws ParseException;

    /**
     * 分页查询
     * @param token 用户token
     * @param queryDTO 分页DTO
     * @return Result
     */
    Result selectPerformancePage(String token,QueryDTO queryDTO);

    /**
     * 下载excel
     * @param response response
     * @param downloadDTO 下载DTO
     * @throws IOException IO
     */
    void downloadPerformance(HttpServletResponse response,DownloadDTO downloadDTO) throws IOException;

    /**单条查询
     * @param performanceId 绩效id
     * @return Result
     */
    Result selectPerformanceItemPage(Integer performanceId);

    /**
     * 单条修改
     * @param token 用户token
     * @param itemDTO 单挑DTO
     * @return Result
     */
    Result updatePerformanceItem(String token, ItemDTO itemDTO);

    /**
     * 提交绩效
     * @param token 用户token
     * @param performanceId 绩效id
     * @return Result
     */
    Result submitPerformance(String token,Integer performanceId);

    /**
     * 保存评分
     * @param token 用户token
     * @param performanceId 绩效id
     * @return Result
     */
    Result gradePerformance(String token,Integer performanceId);

    /**
     * 添加总结
     * @param token 用户token
     * @param summaryDTO 总结DTO
     * @return Result
     */
    Result addSummary(String token, SummaryDTO summaryDTO);

}
