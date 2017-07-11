package com.itmyhome.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;




import com.itmyhome.entity.Cart;
import com.itmyhome.entity.Entry;

import edu.xjsoft.base.service.DefaultEntityManager;

@Service
public class EntryService extends DefaultEntityManager<Entry> {
    @Transactional(readOnly=true)
	public Entry getEntityEntry(){
		String hql="from Entry entry  order by saveTime desc limit 0,1";
		return getEntityDao().findUnique(hql);
	}
    @Transactional(readOnly=true)
    public Entry getEntityByName(String entryname,String price){
    	String hql="from Entry entry where entryname=?  and price=?";
    	return getEntityDao().findUnique(hql, entryname,price);
    }
    @Transactional(readOnly=true)
    public Entry  getEntryById(Integer entryId){
    	String hql="from Entry entry  where entry.entryName=?";
    	return getEntityDao().findUnique(hql, entryId);
    }
}
