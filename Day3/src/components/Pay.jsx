import React, { useState } from 'react';

const RechargePlans = () => {
  const [selectedPlan, setSelectedPlan] = useState(null);
  const [paymentMethod, setPaymentMethod] = useState(null);
  const [rechargeInProgress, setRechargeInProgress] = useState(false);

  const plans = [
    { id: 1, name: 'Basic Plan', price: 10 },
    { id: 2, name: 'Standard Plan', price: 20 },
    { id: 3, name: 'Premium Plan', price: 30 }
  ];

  const handlePlanSelection = (plan) => {
    setSelectedPlan(plan);
  };

  const handlePaymentMethodSelection = (method) => {
    setPaymentMethod(method);
  };

  const handleRecharge = () => {
    if (selectedPlan && paymentMethod) {
      console.log(`Recharging with plan: ${selectedPlan.name} using ${paymentMethod}`);
      // Implement recharge logic here, like making API calls
      setRechargeInProgress(true);
      setTimeout(() => {
        // Simulate recharge completion after 2 seconds
        setRechargeInProgress(false);
        alert('Recharge successful!');
      }, 2000);
    } else {
      alert('Please select a plan and payment method before recharging!');
    }
  };

  return (
    <div>
      <h2>Mobile Recharge Plans</h2>
      <div className="plans-container">
        {plans.map(plan => (
          <div key={plan.id} className={`plan ${selectedPlan && selectedPlan.id === plan.id ? 'selected' : ''}`} onClick={() => handlePlanSelection(plan)}>
            <h3>{plan.name}</h3>
            <p>Price: ${plan.price}</p>
          </div>
        ))}
      </div>
      <h2>Select Payment Method</h2>
      <div>
        <label>
          <input type="radio" name="paymentMethod" value="Credit Card" onChange={() => handlePaymentMethodSelection("Credit Card")} />
          Credit Card
        </label>
        <label>
          <input type="radio" name="paymentMethod" value="Debit Card" onChange={() => handlePaymentMethodSelection("Debit Card")} />
          Debit Card
        </label>
        <label>
          <input type="radio" name="paymentMethod" value="PayPal" onChange={() => handlePaymentMethodSelection("PayPal")} />
          PayPal
        </label>
      </div>
      <button onClick={handleRecharge} disabled={rechargeInProgress}>
        {rechargeInProgress ? 'Recharging...' : 'Recharge'}
      </button>
    </div>
  );
};

export default RechargePlans;
