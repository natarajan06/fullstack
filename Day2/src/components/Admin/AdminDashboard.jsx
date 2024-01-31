import React from 'react';
import PlanManagement from './PlanManagement';
import RechargeHistory from './RechargeHistory';

const AdminDashboard = () => {
  return (
    <div>
      <h2>Admin Dashboard</h2>
      <div>
        <h3>Plan Management</h3>
        <PlanManagement />
      </div>
      <div>
        <h3>Recharge History</h3>
        <RechargeHistory />
      </div>
    </div>
  );
};

export default AdminDashboard;