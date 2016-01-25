/**
 * This file is part of mycollab-services.
 *
 * mycollab-services is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * mycollab-services is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with mycollab-services.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.esofthead.mycollab.module.crm.dao;

import com.esofthead.mycollab.core.persistence.ICrudGenericDAO;
import com.esofthead.mycollab.module.crm.domain.CampaignExample;
import com.esofthead.mycollab.module.crm.domain.CampaignWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@SuppressWarnings({ "ucd", "rawtypes" })
public interface CampaignMapper extends ICrudGenericDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_campaign
     *
     * @mbggenerated Fri Jan 22 00:29:02 ICT 2016
     */
    int countByExample(CampaignExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_campaign
     *
     * @mbggenerated Fri Jan 22 00:29:02 ICT 2016
     */
    int deleteByExample(CampaignExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_campaign
     *
     * @mbggenerated Fri Jan 22 00:29:02 ICT 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_campaign
     *
     * @mbggenerated Fri Jan 22 00:29:02 ICT 2016
     */
    int insert(CampaignWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_campaign
     *
     * @mbggenerated Fri Jan 22 00:29:02 ICT 2016
     */
    int insertSelective(CampaignWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_campaign
     *
     * @mbggenerated Fri Jan 22 00:29:02 ICT 2016
     */
    List<CampaignWithBLOBs> selectByExampleWithBLOBs(CampaignExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_campaign
     *
     * @mbggenerated Fri Jan 22 00:29:02 ICT 2016
     */
    CampaignWithBLOBs selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_campaign
     *
     * @mbggenerated Fri Jan 22 00:29:02 ICT 2016
     */
    int updateByExampleSelective(@Param("record") CampaignWithBLOBs record, @Param("example") CampaignExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_campaign
     *
     * @mbggenerated Fri Jan 22 00:29:02 ICT 2016
     */
    int updateByExampleWithBLOBs(@Param("record") CampaignWithBLOBs record, @Param("example") CampaignExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_campaign
     *
     * @mbggenerated Fri Jan 22 00:29:02 ICT 2016
     */
    int updateByPrimaryKeySelective(CampaignWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_campaign
     *
     * @mbggenerated Fri Jan 22 00:29:02 ICT 2016
     */
    int updateByPrimaryKeyWithBLOBs(CampaignWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_campaign
     *
     * @mbggenerated Fri Jan 22 00:29:02 ICT 2016
     */
    Integer insertAndReturnKey(CampaignWithBLOBs value);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_campaign
     *
     * @mbggenerated Fri Jan 22 00:29:02 ICT 2016
     */
    void removeKeysWithSession(List primaryKeys);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_campaign
     *
     * @mbggenerated Fri Jan 22 00:29:02 ICT 2016
     */
    void massUpdateWithSession(@Param("record") CampaignWithBLOBs record, @Param("primaryKeys") List primaryKeys);
}