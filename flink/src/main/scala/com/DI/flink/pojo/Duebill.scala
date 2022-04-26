package com.DI.flink.pojo

/**
 * @author Rikka
 * @date 2022-04-26 23:15:44
 * @description
 */
case class Duebill(uid: Option[String],
                   acct_no: Option[String],
                   receipt_no: Option[String],
                   contract_no: Option[String],
                   subject_no: Option[String],
                   cust_no: Option[String],
                   loan_cust_no: Option[String],
                   cust_name: Option[String],
                   buss_type: Option[String],
                   curr_type: Option[String],
                   buss_amt: Option[Double],
                   putout_date: Option[String],
                   matu_date: Option[String],
                   actu_matu_date: Option[String],
                   buss_rate: Option[Double],
                   actu_buss_rate: Option[Double],
                   intr_type: Option[String],
                   intr_cyc: Option[String],
                   pay_times: Option[Int],
                   pay_cyc: Option[String],
                   extend_times: Option[Int],
                   bal: Option[Double],
                   norm_bal: Option[Double],
                   dlay_amt: Option[Double],
                   dull_amt: Option[Double],
                   bad_debt_amt: Option[Double],
                   owed_int_in: Option[Double],
                   owed_int_out: Option[Double],
                   fine_pr_int: Option[Double],
                   fine_intr_int: Option[Double],
                   dlay_days: Option[Int],
                   pay_acct: Option[String],
                   putout_acct: Option[String],
                   pay_back_acct: Option[String],
                   due_intr_days: Option[Int],
                   operate_org: Option[String],
                   operator: Option[String],
                   reg_org: Option[String],
                   register: Option[String],
                   occur_date: Option[String],
                   loan_use: Option[String],
                   pay_type: Option[String],
                   pay_freq: Option[String],
                   vouch_type: Option[String],
                   mgr_no: Option[String],
                   mge_org: Option[String],
                   loan_channel: Option[String],
                   ten_class: Option[String],
                   src_dt: Option[String],
                   etl_dt: Option[String])
