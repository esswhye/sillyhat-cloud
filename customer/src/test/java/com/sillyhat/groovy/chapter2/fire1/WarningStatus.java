package com.sillyhat.groovy.chapter2.fire1;

public class WarningStatus {
	private final boolean alarmActive;
	private final boolean fireDepartmentNotified;
	
	public WarningStatus(boolean alarmActive,boolean fireDepartmentNotified)
	{
		this.alarmActive = alarmActive;
		this.fireDepartmentNotified = fireDepartmentNotified;
	}
	
	public boolean isAlarmActive() {
		return alarmActive;
	}

	public boolean isFireDepartmentNotified() {
		return fireDepartmentNotified;
	}

	

	
}
