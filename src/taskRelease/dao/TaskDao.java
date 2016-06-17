package taskRelease.dao;

import java.util.List;

import taskRelease.bean.Task;

public interface TaskDao {
	public List<Task> selectNewTask();
	public List<Task> selectFinishTask();
}
