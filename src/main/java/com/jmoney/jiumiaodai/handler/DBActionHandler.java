package com.jmoney.jiumiaodai.handler;

import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.jmoney.jiumiaodai.base.TestStep;
import com.jmoney.jiumiaodai.util.AppiumUtil;
import com.jmoney.jiumiaodai.util.DBHelper;
import com.jmoney.jiumiaodai.util.SeleniumUtil;

public class DBActionHandler {
	
	public void dbInsert(TestStep step) throws Exception{
		System.out.println("『正常测试』开始执行: "+ step.getValue() + " <" +step.getDesc() + ">");
		int n = DBHelper.insert(AppiumUtil.parseStringHasEls(step.getValue()));
		if(n > 0){	
		}
	}
	
	public void dbInsertm(TestStep step) throws Exception{
		System.out.println("『正常测试』开始执行: "+ step.getValue() + " <" +step.getDesc() + ">");
		int n = DBHelper.insert1(AppiumUtil.parseStringHasEls(step.getValue()));
		if(n > 0){	
		}
	}
	
	public void dbDelete(TestStep step) throws Exception{
		System.out.println("『正常测试』开始执行: "+ step.getValue() + " <" +step.getDesc() + ">");
		int n = DBHelper.delete(AppiumUtil.parseStringHasEls(step.getValue()));
		if(n > 0){	
		}
	}
	
	public void dbDeletem(TestStep step) throws Exception{
		System.out.println("『正常测试』开始执行: "+ step.getValue() + " <" +step.getDesc() + ">");
		int n = DBHelper.delete1(AppiumUtil.parseStringHasEls(step.getValue()));
		if(n > 0){	
		}
	}
	
	public void dbUpdate(TestStep step) throws Exception{
		System.out.println("『正常测试』开始执行: "+ step.getValue() + " <" +step.getDesc() + ">");
		String sql = AppiumUtil.parseStringHasEls(step.getValue());
//		System.err.println("Query-update "+sql);
		int n = DBHelper.update(sql);
		if(n > 0){
			System.out.println("『正常测试』开始执行: "+ step.getValue() + " <" +step.getDesc() + ">");
//			Reporter.log(base.getDesc());
		}	
	}
	
	public void dbUpdatem(TestStep step) throws Exception{
		System.out.println("『正常测试』开始执行: "+ step.getValue() + " <" +step.getDesc() + ">");
		String sql = AppiumUtil.parseStringHasEls(step.getValue());
//		System.err.println("Query-update "+sql);
		int n = DBHelper.update1(sql);
		if(n > 0){
			System.out.println("『正常测试』开始执行: "+ step.getValue() + " <" +step.getDesc() + ">");
//			Reporter.log(base.getDesc());
		}	
	}
	
	public void dbQuerya(TestStep step) throws Exception{
		if(StringUtils.isBlank(step.getDetails().get("key")))
			throw new Exception("数据库查询务必设置保存结果的键值，供后续操作使用，例子为details='key:credit'！");
		String sql = AppiumUtil.parseStringHasEls(step.getValue());
//		System.err.println("Query-sql "+sql);
		System.out.println("『正常测试』开始执行: "+ step.getValue() + " <" +step.getDesc() + ">");
		List<Map<String, Object>> st = DBHelper.query(sql);
		AppiumUtil.localmap.put(step.getDetails().get("key").toUpperCase(), st);
//		System.out.println("『正常测试』开始执行: <成功记录到本地List列表，" +AppiumUtil.localmap.toString() + ">");
	}
	
	public void dbQueryw(TestStep step) throws Exception{
		if(StringUtils.isBlank(step.getDetails().get("key")))
			throw new Exception("数据库查询务必设置保存结果的键值，供后续操作使用，例子为details='key:credit'！");
		String sql = SeleniumUtil.parseStringHasEls(step.getValue());
//		System.err.println("Query-sql "+sql);
		System.out.println("『正常测试』开始执行: "+ step.getValue() + " <" +step.getDesc() + ">");
		List<Map<String, Object>> st = DBHelper.query(sql);
		SeleniumUtil.localmap.put(step.getDetails().get("key").toUpperCase(), st);
//		System.out.println("『正常测试』开始执行: <成功记录到本地List列表，" +SeleniumUtil.localmap.toString() + ">");
	}
	
	public void dbQueryma(TestStep step) throws Exception{
		if(StringUtils.isBlank(step.getDetails().get("key")))
			throw new Exception("数据库查询务必设置保存结果的键值，供后续操作使用，例子为details='key:credit'！");
		String sql = AppiumUtil.parseStringHasEls(step.getValue());
//		System.err.println("Query-sql "+sql);
		System.out.println("『正常测试』开始执行: "+ step.getValue() + " <" +step.getDesc() + ">");
		List<Map<String, Object>> st = DBHelper.query1(sql);
		AppiumUtil.localmap.put(step.getDetails().get("key").toUpperCase(), st);
//		System.out.println("『正常测试』开始执行: <成功记录到本地List列表，" +AppiumUtil.localmap.toString() + ">");
	}
	
	public void dbQuerymw(TestStep step) throws Exception{
		if(StringUtils.isBlank(step.getDetails().get("key")))
			throw new Exception("数据库查询务必设置保存结果的键值，供后续操作使用，例子为details='key:credit'！");
		String sql = SeleniumUtil.parseStringHasEls(step.getValue());
//		System.err.println("Query-sql "+sql);
		System.out.println("『正常测试』开始执行: "+ step.getValue() + " <" +step.getDesc() + ">");
		List<Map<String, Object>> st = DBHelper.query1(sql);
		SeleniumUtil.localmap.put(step.getDetails().get("key").toUpperCase(), st);
//		System.out.println("『正常测试』开始执行: <成功记录到本地List列表，" +SeleniumUtil.localmap.toString() + ">");
	}
	
	public void dbQuerymssha(TestStep step) throws Exception{
		if(StringUtils.isBlank(step.getDetails().get("key")))
			throw new Exception("数据库查询务必设置保存结果的键值，供后续操作使用，例子为details='key:credit'！");
		String sql = AppiumUtil.parseStringHasEls(step.getValue());
//		System.err.println("Query-sql "+sql);
		System.out.println("『正常测试』开始执行: "+ step.getValue() + " <" +step.getDesc() + ">");
		List<Map<String, Object>> st = DBHelper.query2(sql);
		AppiumUtil.localmap.put(step.getDetails().get("key").toUpperCase(), st);
//		System.out.println("『正常测试』开始执行: <成功记录到本地List列表，" +AppiumUtil.localmap.toString() + ">");
	}
	
	public void dbQuerymsshw(TestStep step) throws Exception{
		if(StringUtils.isBlank(step.getDetails().get("key")))
			throw new Exception("数据库查询务必设置保存结果的键值，供后续操作使用，例子为details='key:credit'！");
		String sql = SeleniumUtil.parseStringHasEls(step.getValue());
//		System.err.println("Query-sql "+sql);
		System.out.println("『正常测试』开始执行: "+ step.getValue() + " <" +step.getDesc() + ">");
		List<Map<String, Object>> st = DBHelper.query2(sql);
		SeleniumUtil.localmap.put(step.getDetails().get("key").toUpperCase(), st);
//		System.out.println("『正常测试』开始执行: <成功记录到本地List列表，" +SeleniumUtil.localmap.toString() + ">");
	}
	
	public void dbProcedure(TestStep step) throws Exception{
		String params = AppiumUtil.parseStringHasEls(step.getValue());
		System.out.println("『正常测试』开始执行: "+ step.getDetails().get("prc_name") + params + " <" +step.getDesc() + ">");
		int n =DBHelper.procedure(step.getDetails().get("prc_name"),params,null);
		if(n > 0){	
		}
	}
	
	public void dbProcedurem(TestStep step) throws Exception{
		String params = AppiumUtil.parseStringHasEls(step.getValue());
		System.out.println("『正常测试』开始执行: "+ step.getDetails().get("prc_name") + params + " <" +step.getDesc() + ">");
		int n =DBHelper.procedure1(step.getDetails().get("prc_name"),params,null);
		if(n > 0){	
		}
	}
}
