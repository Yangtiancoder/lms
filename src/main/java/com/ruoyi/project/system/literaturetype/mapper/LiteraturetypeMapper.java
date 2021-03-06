package com.ruoyi.project.system.literaturetype.mapper;

import com.ruoyi.project.system.literaturetype.domain.Literaturetype;

import java.util.List;

/**
 * 文献类目 数据层
 * 
 * @author wuqichuan
 * @date 2019-04-04
 */
public interface LiteraturetypeMapper 
{
	/**
     * 查询文献类目信息
     * 
     * @param typeId 文献类目ID
     * @return 文献类目信息
     */
	public Literaturetype selectLiteraturetypeById(Integer typeId);
	
	/**
     * 查询文献类目列表
     * 
     * @param literaturetype 文献类目信息
     * @return 文献类目集合
     */
	public List<Literaturetype> selectLiteraturetypeList(Literaturetype literaturetype);
	
	/**
     * 新增文献类目
     * 
     * @param literaturetype 文献类目信息
     * @return 结果
     */
	public int insertLiteraturetype(Literaturetype literaturetype);
	
	/**
     * 修改文献类目
     * 
     * @param literaturetype 文献类目信息
     * @return 结果
     */
	public int updateLiteraturetype(Literaturetype literaturetype);
	
	/**
     * 删除文献类目
     * 
     * @param typeId 文献类目ID
     * @return 结果
     */
	public int deleteLiteraturetypeById(Integer typeId);
	
	/**
     * 批量删除文献类目
     * 
     * @param typeIds 需要删除的数据ID
     * @return 结果
     */
	public int deleteLiteraturetypeByIds(String[] typeIds);
	
}