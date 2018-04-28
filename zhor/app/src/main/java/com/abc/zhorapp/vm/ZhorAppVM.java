package com.abc.zhorapp.vm;


import com.abc.common.base.BaseVM;
import com.abc.mvvmlib.command.ReplyCommand;
import com.abc.root_router.Router;
import com.abc.zhorapp.databinding.ZhorActivityAppBinding;
import com.abc.zhorapp.model.ZhorAppModel;
import com.abc.zhorapp.view.ZhorAppActivity;
/**
 * Created by wudi on 2018/4/28.
 */
public class ZhorAppVM extends BaseVM<ZhorAppActivity,ZhorAppModel,ZhorActivityAppBinding> {

    public ZhorAppVM(ZhorAppActivity view, ZhorAppModel model, ZhorActivityAppBinding binding) {
        super(view, model, binding);
    }

    public ReplyCommand goMainView  = new ReplyCommand(() -> Router.build("/ZhorMainActivity").go(mView)) ;

    public ReplyCommand goHomeView = new ReplyCommand(() -> Router.build("/ZhorHomeActivity").go(mView));
}
