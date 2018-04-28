package com.abc.zhor_main;

import android.databinding.DataBindingUtil;

import com.abc.common.base.BaseActivity;
import com.abc.root_router.annotation.RouterAction;
import com.abc.zhor_main.databinding.ZhorMainActivityMainBinding;
import com.abc.zhor_main.model.ZhorMainModel;
import com.abc.zhor_main.vm.ZhorMainVM;

@RouterAction(path = "/ZhorMainActivity")
public class ZhorMainActivity extends BaseActivity<ZhorMainVM,ZhorMainActivityMainBinding> {

    private ZhorMainModel mModel;

    @Override
    public ZhorMainActivityMainBinding setLayoutToView() {
        return DataBindingUtil.setContentView(this, R.layout.zhor_main_activity_main);
    }

    @Override
    public void setModelToBinding() {
        ZhorMainModel zhorMainModel = new ZhorMainModel("张三", 25);
        mBinding.setMain(zhorMainModel);
    }

    @Override
    public ZhorMainVM createVM() {
        return new ZhorMainVM(this,mModel,mBinding);
    }

    @Override
    protected void setVMToBinding() {

    }

    @Override
    protected void initView() {

    }
}
