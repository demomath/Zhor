package com.abc.zhor_main.vm;

import com.abc.common.base.BaseVM;
import com.abc.zhor_main.ZhorMainActivity;
import com.abc.zhor_main.databinding.ZhorMainActivityMainBinding;
import com.abc.zhor_main.model.ZhorMainModel;

/**
 * Created by wudi on 2018/4/27.
 */

public class ZhorMainVM extends BaseVM<ZhorMainActivity,ZhorMainModel,ZhorMainActivityMainBinding> {
    public ZhorMainVM(ZhorMainActivity view, ZhorMainModel model, ZhorMainActivityMainBinding binding) {
        super(view, model, binding);
    }
}
