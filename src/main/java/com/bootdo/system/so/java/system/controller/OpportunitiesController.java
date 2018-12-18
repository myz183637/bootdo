package com.bootdo.system.so.java.system.controller;

import java.util.List;
import java.util.Map;

import com.bootdo.system.so.java.system.domain.OpportunitiesDO;
import com.bootdo.system.so.java.system.service.OpportunitiesService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 销售机会
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-12-18 10:12:24
 */
 
@Controller
@RequestMapping("/system/opportunities")
public class OpportunitiesController {
	@Autowired
	private OpportunitiesService opportunitiesService;
	
	@GetMapping()
	@RequiresPermissions("system:opportunities:opportunities")
	String Opportunities(){
	    return "system/opportunities/opportunities";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("system:opportunities:opportunities")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<OpportunitiesDO> opportunitiesList = opportunitiesService.list(query);
		int total = opportunitiesService.count(query);
		PageUtils pageUtils = new PageUtils(opportunitiesList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("system:opportunities:add")
	String add(){
	    return "system/opportunities/add";
	}

	@GetMapping("/edit/{soId}")
	@RequiresPermissions("system:opportunities:edit")
	String edit(@PathVariable("soId") Integer soId,Model model){
		OpportunitiesDO opportunities = opportunitiesService.get(soId);
		model.addAttribute("opportunities", opportunities);
	    return "system/opportunities/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:opportunities:add")
	public R save( OpportunitiesDO opportunities){
		if(opportunitiesService.save(opportunities)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:opportunities:edit")
	public R update( OpportunitiesDO opportunities){
		opportunitiesService.update(opportunities);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("system:opportunities:remove")
	public R remove( Integer soId){
		if(opportunitiesService.remove(soId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("system:opportunities:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] soIds){
		opportunitiesService.batchRemove(soIds);
		return R.ok();
	}
	
}
