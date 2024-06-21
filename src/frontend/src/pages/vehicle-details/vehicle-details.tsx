import { useParams } from "react-router-dom";

const VehicleDetails = () => {
  const { id } = useParams();

  return (
    <div className="vehicle-details">
      <h2>Vehicle #{id}</h2>
    </div>
  );
};

export default VehicleDetails;
