package com.salesmanager.shop.store.controller.tax.facade;

import com.salesmanager.core.model.merchant.MerchantStore;
import com.salesmanager.core.model.reference.language.Language;
import com.salesmanager.shop.model.entity.Entity;
import com.salesmanager.shop.model.entity.ReadableEntityList;
import com.salesmanager.shop.model.entity.ReadableList;
import com.salesmanager.shop.model.tax.PersistableTaxClass;
import com.salesmanager.shop.model.tax.PersistableTaxRate;
import com.salesmanager.shop.model.tax.ReadableTaxClass;
import com.salesmanager.shop.model.tax.ReadableTaxRate;

public interface TaxFacade {
	
	Entity createTaxClass(PersistableTaxClass taxClass, MerchantStore store, Language language);
	void updateTaxClass(Long id, PersistableTaxClass taxClass, MerchantStore store, Language language);
	void deleteTaxClass(Long id, MerchantStore store, Language language);
	boolean uniqueTaxClass(String code, MerchantStore store, Language language);

	ReadableEntityList<ReadableTaxClass> taxClasses(MerchantStore store, Language language);
	ReadableTaxClass taxClass(String code, MerchantStore store, Language language);
	
	
	void saveTaxRate(PersistableTaxRate taxRate, MerchantStore store, Language language);
	void deleteTaxRate(Long id, MerchantStore store, Language language);
	
	ReadableList taxRates(MerchantStore store, Language language);
	ReadableTaxRate taxRate(Long id, MerchantStore store, Language language);
	
	
	

}
