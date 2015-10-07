package com.blue.sky.smart.framework;

import android.content.Context;
import android.support.v4.app.FragmentTabHost;
import android.util.AttributeSet;

/**
 * tabhost
 * @author FireAnt（http://my.oschina.net/LittleDY）
 * @version 创建时间：2014年9月28日 下午2:27:51 
 * 
 */

public class SmartFragmentTabHost extends FragmentTabHost {

	private String mCurrentTag;

	private String mNoTabChangedTag;

	public SmartFragmentTabHost(Context context, AttributeSet attrs) {
		super(context, attrs);
	}
	
	@Override
	public void onTabChanged(String tag) {
		
		if (tag.equals(mNoTabChangedTag)) {
			setCurrentTabByTag(mCurrentTag);
		} else {
			super.onTabChanged(tag);
			mCurrentTag = tag;
		}
	}
	
	public void setNoTabChangedTag(String tag) {
		this.mNoTabChangedTag = tag;
	}
}
