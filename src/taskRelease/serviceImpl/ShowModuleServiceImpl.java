package taskRelease.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import taskRelease.bean.Task;
import taskRelease.dao.TaskDao;
import taskRelease.dao.UserInfoDao;
import taskRelease.pojo.ShowInfo;
import taskRelease.service.ShowModuleService;
import taskRelease.util.FunUtil;

@Service
public class ShowModuleServiceImpl implements ShowModuleService{
	
	@Autowired
	public TaskDao taskDao;
	@Autowired
	public UserInfoDao userInfoDao;
	
	public List<ShowInfo> showModule1() {
		// TODO Auto-generated method stub
		List<Task> task = taskDao.selectNewTask();
		List<ShowInfo> res = new ArrayList<ShowInfo>();
		for(int i=0;i<task.size();i++){
			Integer teaId = task.get(i).getReleaseTea();
			Integer stuId = task.get(i).getReceiverStu();
			String teaName = userInfoDao.selectUserInfoById(teaId).getFullName();
			String stuName = userInfoDao.selectUserInfoById(stuId).getFullName();
			ShowInfo si = new ShowInfo();
			si.setInfo(teaName+"给"+stuName+"发布了"+task.get(i).getTitle()+"任务");
			si.setTime(FunUtil.longToDateTimeStr(task.get(i).getReleaseTime(), "yyyy-MM-dd HH:mm:ss"));
			res.add(si);
		}
		return res;
	}
	
	public List<ShowInfo> showModule2() {
		// TODO Auto-generated method stub
		List<Task> task = taskDao.selectFinishTask();
		List<ShowInfo> res = new ArrayList<ShowInfo>();
		for(int i=0;i<task.size();i++){
			Integer teaId = task.get(i).getReleaseTea();
			Integer stuId = task.get(i).getReceiverStu();
			String teaName = userInfoDao.selectUserInfoById(teaId).getFullName();
			String stuName = userInfoDao.selectUserInfoById(stuId).getFullName();
			ShowInfo si = new ShowInfo();
			si.setInfo(stuName+"完成了"+teaName+"发布的"+task.get(i).getTitle()+"任务");
			si.setTime(FunUtil.longToDateTimeStr(task.get(i).getReleaseTime(), "yyyy-MM-dd HH:mm:ss"));
			res.add(si);
		}
		return res;
	}
}
