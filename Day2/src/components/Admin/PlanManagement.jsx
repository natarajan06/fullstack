// PlanManagement.js
import React from 'react';
import PlanList from './PlanList';
import AddonList from './AddonList';

const PlanManagement = () => {
  return (
    <div>
      <h4>Plans</h4>
      <PlanList />
      <h4>Add-ons</h4>
      <AddonList />
    </div>
  );
};

export default PlanManagement;
