package com.blue.sky.smart.framework;

import com.blue.sky.smart.R;

public enum SmartTabEnum {

	HOME(0, R.string.tab_item_home, R.drawable.tab_icon_new,
			SmartTabItemFragment.class),

	CATEGORY(1, R.string.tab_item_category, R.drawable.tab_icon_tweet,
			SmartTabItemFragment.class),

	CHAT(2, R.string.tab_item_chat, R.drawable.tab_icon_new,
			SmartTabItemFragment.class),

	FIND(3, R.string.tab_item_find, R.drawable.tab_icon_explore,
			SmartTabItemFragment.class),

	ME(4, R.string.tab_item_me, R.drawable.tab_icon_me,
			SmartTabItemFragment.class);

	private int idx;
	private int resName;
	private int resIcon;
	private Class<?> clz;

	private SmartTabEnum(int idx, int resName, int resIcon, Class<?> clz) {
		this.idx = idx;
		this.resName = resName;
		this.resIcon = resIcon;
		this.clz = clz;
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public int getResName() {
		return resName;
	}

	public void setResName(int resName) {
		this.resName = resName;
	}

	public int getResIcon() {
		return resIcon;
	}

	public void setResIcon(int resIcon) {
		this.resIcon = resIcon;
	}

	public Class<?> getClz() {
		return clz;
	}

	public void setClz(Class<?> clz) {
		this.clz = clz;
	}
}
