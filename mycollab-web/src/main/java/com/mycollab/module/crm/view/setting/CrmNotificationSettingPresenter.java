/**
 * Copyright © MyCollab
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.mycollab.module.crm.view.setting;

import com.mycollab.module.crm.domain.CrmNotificationSetting;
import com.mycollab.module.crm.service.CrmNotificationSettingService;
import com.mycollab.module.crm.view.CrmGenericPresenter;
import com.mycollab.spring.AppContextUtil;
import com.mycollab.vaadin.AppUI;
import com.mycollab.vaadin.UserUIContext;
import com.mycollab.vaadin.mvp.ScreenData;
import com.vaadin.ui.HasComponents;

/**
 * @author MyCollab Ltd.
 * @since 1.0
 */
public class CrmNotificationSettingPresenter extends CrmGenericPresenter<CrmNotificationSettingView> {
    private static final long serialVersionUID = 1L;

    public CrmNotificationSettingPresenter() {
        super(CrmNotificationSettingView.class);
    }

    @Override
    protected void onGo(HasComponents container, ScreenData<?> data) {
        CrmSettingContainer settingContainer = (CrmSettingContainer) container;
        settingContainer.gotoSubView("notification");

        CrmNotificationSettingService service = AppContextUtil.getSpringBean(CrmNotificationSettingService.class);
        CrmNotificationSetting setting = service.findNotification(UserUIContext.getUsername(), AppUI.getAccountId());
        view.showNotificationSettings(setting);

        AppUI.addFragment("crm/setting/notification", "Notification Settings");
    }
}
