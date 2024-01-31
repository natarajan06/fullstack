import React, { useState } from 'react';
import { Link } from 'react-router-dom'; // Import Link from react-router-dom
import './Plan.css';
import CustomNavBar from './customnavbar';

const MobileRechargePlans = () => {
  const [selectedPlan, setSelectedPlan] = useState(null);

  const plans = [
    { id: 1, name: 'Basic Plan', price: '$10', data: '1GB', validity: '30 days' },
    { id: 2, name: 'Standard Plan', price: '$20', data: '2GB', validity: '30 days' },
    { id: 3, name: 'Premium Plan', price: '$30', data: '5GB', validity: '30 days' }
  ];

  const handlePlanSelection = (plan) => {
    setSelectedPlan(plan);
  };

  const handleRecharge = () => {
    if (selectedPlan) {
      console.log(`Recharging with plan: ${selectedPlan.name}`);
      {MobileRechargePlans ? 'Recharging...' : 'Recharge'}
      // Implement recharge logic here, like making API calls
    } else {
      alert('Please select a plan before recharging!');
    }
  };

  return (
    <div>
      <h2>Mobile Recharge Plans</h2>
      <div className="plans-container">
        {plans.map(plan => (
          <div key={plan.id} className={`plan ${selectedPlan && selectedPlan.id === plan.id ? 'selected' : ''}`} onClick={() => handlePlanSelection(plan)}>
            <h3>{plan.name}</h3>
            <p>Price: {plan.price}</p>
            <p>Data: {plan.data}</p>
            <p>Validity: {plan.validity}</p>
          </div>
        ))}
      </div>
      <button onClick={handleRecharge}>Recharge
      
      </button>
      
    </div>
  );
};

export default MobileRechargePlans;
