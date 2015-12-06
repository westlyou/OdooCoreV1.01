package com.odoo.addons.preventive.providers;

import com.odoo.base.addons.res.CmmsPreventive;
import com.odoo.core.orm.provider.BaseModelProvider;

/**
 * Created by Burol on 05/12/2015.
 */
public class PreventiveSyncProvider extends BaseModelProvider {
    public static final String TAG = PreventiveSyncProvider.class.getSimpleName();

    @Override
    public String authority() {
        return CmmsPreventive.AUTHORITY;
    }

}
