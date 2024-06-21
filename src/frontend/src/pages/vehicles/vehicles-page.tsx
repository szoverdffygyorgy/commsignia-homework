import Vehicles from "./components/vehicles/vehicles";
import VehicleProvider from "../../contexts/vehicle/vehicle-provider";

const VehiclesPage = () => {
  return (
    <VehicleProvider>
      <Vehicles />
    </VehicleProvider>
  );
};

export default VehiclesPage;
