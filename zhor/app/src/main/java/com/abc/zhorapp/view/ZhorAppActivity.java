package com.abc.zhorapp.view;

import android.databinding.DataBindingUtil;

import com.abc.common.base.BaseActivity;
import com.abc.zhorapp.R;
import com.abc.zhorapp.databinding.ZhorActivityAppBinding;
import com.abc.zhorapp.model.ZhorAppModel;
import com.abc.zhorapp.vm.ZhorAppVM;

/**
 * Created by wudi on 2018/4/25.
 * 壳工程首页
 */
public class ZhorAppActivity extends BaseActivity<ZhorAppVM,ZhorActivityAppBinding> implements IView{

    private ZhorAppModel mModel;

    @Override
    public ZhorActivityAppBinding setLayoutToView() {
        return DataBindingUtil.setContentView(this, R.layout.zhor_activity_app);
    }

    @Override
    public void setModelToBinding() {
        mModel = new ZhorAppModel ("跳转到main", "跳转到home");
        mBinding.setZhormodel(mModel);
    }

    @Override
    public ZhorAppVM createVM() {
        return new ZhorAppVM(this,mModel,mBinding);
    }

    @Override
    protected void setVMToBinding() {
        mBinding.setZhorvm(mViewModel);
    }

    @Override
    protected void initView() {

    }
}
