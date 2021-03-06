package com.xeiam.datasets.higgsboson.business;

/**
 * Copyright (C) 2013-2014 Xeiam LLC http://xeiam.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
 * of the Software, and to permit persons to whom the Software is furnished to do
 * so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

import java.util.List;

import com.xeiam.datasets.common.business.DatasetsDAO;
import com.xeiam.yank.DBProxy;

/**
 * @author timmolter
 */
public class HiggsBosonDAO extends DatasetsDAO {

  public static void init(String dataFilesDir) {

    String dataFileID = "0ByP7_A9vXm17YjljQVUwQmlOa0E";
    String propsFileID = "0ByP7_A9vXm17NWdLWUZVaXE3X3c";
    String scriptFileID = "0ByP7_A9vXm17a0dBNjVLZnR2SVk";

    init("higgsbosonconnectionpool", "DB_HIGGS_BOSON", dataFilesDir, dataFileID, propsFileID, scriptFileID, null, true);
  }

  public static int dropTable() {

    return DBProxy.executeSQL("higgsbosonconnectionpool", "DROP TABLE IF EXISTS HIGGS_BOSON", null);
  }

  public static int createTable() {

    String CREATE =
        "CREATE CACHED TABLE HIGGS_BOSON (EventId INTEGER NOT NULL, DER_mass_MMC FLOAT NULL, DER_mass_transverse_met_lep FLOAT NULL, DER_mass_vis FLOAT NULL, DER_pt_h FLOAT NULL, DER_deltaeta_jet_jet FLOAT NULL, DER_mass_jet_jet FLOAT NULL, DER_prodeta_jet_jet FLOAT NULL, DER_deltar_tau_lep FLOAT NULL, DER_pt_tot FLOAT NULL, DER_sum_pt FLOAT NULL, DER_pt_ratio_lep_tau FLOAT NULL, DER_met_phi_centrality FLOAT NULL, DER_lep_eta_centrality FLOAT NULL, PRI_tau_pt FLOAT NULL, PRI_tau_eta FLOAT NULL, PRI_tau_phi FLOAT NULL, PRI_lep_pt FLOAT NULL, PRI_lep_eta FLOAT NULL, PRI_lep_phi FLOAT NULL, PRI_met FLOAT NULL, PRI_met_phi FLOAT NULL, PRI_met_sumet FLOAT NULL, PRI_jet_num FLOAT NULL, PRI_jet_leading_pt FLOAT NULL, PRI_jet_leading_eta FLOAT NULL, PRI_jet_leading_phi FLOAT NULL, PRI_jet_subleading_pt FLOAT NULL, PRI_jet_subleading_eta FLOAT NULL, PRI_jet_subleading_phi FLOAT NULL, PRI_jet_all_pt FLOAT NULL, Weight FLOAT NULL, Label VARCHAR(1) NULL, PRIMARY KEY (EventId))";
    return DBProxy.executeSQL("higgsbosonconnectionpool", CREATE, null);
  }

  public static int insert(HiggsBoson higgsBoson) {

    Object[] params = new Object[] {

    // @formatter:off
        higgsBoson.getEventId(),
        higgsBoson.getDER_mass_MMC(),
        higgsBoson.getDER_mass_transverse_met_lep(),
        higgsBoson.getDER_mass_vis(),
        higgsBoson.getDER_pt_h(),
        higgsBoson.getDER_deltaeta_jet_jet(),
        higgsBoson.getDER_mass_jet_jet(),
        higgsBoson.getDER_prodeta_jet_jet(),
        higgsBoson.getDER_deltar_tau_lep(),
        higgsBoson.getDER_pt_tot(),
        higgsBoson.getDER_sum_pt(),
        higgsBoson.getDER_pt_ratio_lep_tau(),
        higgsBoson.getDER_met_phi_centrality(),
        higgsBoson.getDER_lep_eta_centrality(),
        higgsBoson.getPRI_tau_pt(),
        higgsBoson.getPRI_tau_eta(),
        higgsBoson.getPRI_tau_phi(),
        higgsBoson.getPRI_lep_pt(),
        higgsBoson.getPRI_lep_eta(),
        higgsBoson.getPRI_lep_phi(),
        higgsBoson.getPRI_met(),
        higgsBoson.getPRI_met_phi(),
        higgsBoson.getPRI_met_sumet(),
        higgsBoson.getPRI_jet_num(),
        higgsBoson.getPRI_jet_leading_pt(),
        higgsBoson.getPRI_jet_leading_eta(),
        higgsBoson.getPRI_jet_leading_phi(),
        higgsBoson.getPRI_jet_subleading_pt(),
        higgsBoson.getPRI_jet_subleading_eta(),
        higgsBoson.getPRI_jet_subleading_phi(),
        higgsBoson.getPRI_jet_all_pt(),
        higgsBoson.getWeight(),
        higgsBoson.getLabel()
    // @formatter:on
        };
    String INSERT =
        "INSERT INTO HIGGS_BOSON (EventId, DER_mass_MMC,DER_mass_transverse_met_lep,DER_mass_vis,DER_pt_h,DER_deltaeta_jet_jet,DER_mass_jet_jet,DER_prodeta_jet_jet,DER_deltar_tau_lep,DER_pt_tot,DER_sum_pt,DER_pt_ratio_lep_tau,DER_met_phi_centrality,DER_lep_eta_centrality,PRI_tau_pt,PRI_tau_eta,PRI_tau_phi,PRI_lep_pt,PRI_lep_eta,PRI_lep_phi,PRI_met,PRI_met_phi,PRI_met_sumet,PRI_jet_num,PRI_jet_leading_pt,PRI_jet_leading_eta,PRI_jet_leading_phi,PRI_jet_subleading_pt,PRI_jet_subleading_eta,PRI_jet_subleading_phi,PRI_jet_all_pt,Weight,Label) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    return DBProxy.executeSQL("higgsbosonconnectionpool", INSERT, params);

  }

  public static List<HiggsBoson> selectAll() {

    String SELECT_ALL = "SELECT * FROM HIGGS_BOSON";

    return DBProxy.queryObjectListSQL("higgsbosonconnectionpool", SELECT_ALL, HiggsBoson.class, null);
  }

  public static List<HiggsBoson> selectTrain() {

    String SELECT_ALL = "SELECT * FROM HIGGS_BOSON WHERE EVENTID < 350000";

    return DBProxy.queryObjectListSQL("higgsbosonconnectionpool", SELECT_ALL, HiggsBoson.class, null);
  }

  public static List<HiggsBoson> selectTest() {

    String SELECT_ALL = "SELECT * FROM HIGGS_BOSON WHERE EVENTID >= 350000";

    return DBProxy.queryObjectListSQL("higgsbosonconnectionpool", SELECT_ALL, HiggsBoson.class, null);
  }

  public static HiggsBoson selectSingle(int EVENTID) {

    Object[] params = new Object[] { EVENTID };

    String SELECT_SINGLE = "SELECT * FROM HIGGS_BOSON WHERE EVENTID = ?";

    return DBProxy.querySingleObjectSQL("higgsbosonconnectionpool", SELECT_SINGLE, HiggsBoson.class, params);
  }

  public static long selectCount() {

    String SELECT_COUNT = "SELECT COUNT(*) FROM HIGGS_BOSON";

    return DBProxy.querySingleScalarSQL("higgsbosonconnectionpool", SELECT_COUNT, Long.class, null);
  }

  public static List<HiggsBoson> selectBackground() {

    String SELECT_ALL = "SELECT * FROM HIGGS_BOSON WHERE EVENTID < 350000 AND Label = 'b'";

    return DBProxy.queryObjectListSQL("higgsbosonconnectionpool", SELECT_ALL, HiggsBoson.class, null);
  }

  public static List<HiggsBoson> selectSignal() {

    String SELECT_ALL = "SELECT * FROM HIGGS_BOSON WHERE EVENTID < 350000 AND Label = 's'";

    return DBProxy.queryObjectListSQL("higgsbosonconnectionpool", SELECT_ALL, HiggsBoson.class, null);
  }

}
