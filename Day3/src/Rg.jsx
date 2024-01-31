import React, { useState } from 'react';

const RechargeButton = () => {
  const [rechargeInProgress, setRechargeInProgress] = useState(false);

  const handleRecharge = () => {
    // Simulate recharge process
    setRechargeInProgress(true);
    setTimeout(() => {
      // Simulate recharge completion after 2 seconds
      setRechargeInProgress(false);
      alert('Recharge successful!');
    }, 2000);
  };

  return (
    <div>
      <button onClick={handleRecharge} disabled={rechargeInProgress}>
        {rechargeInProgress ? 'Recharging...' : 'Recharge'}
      </button>
    </div>
  );
};

export default RechargeButton;
