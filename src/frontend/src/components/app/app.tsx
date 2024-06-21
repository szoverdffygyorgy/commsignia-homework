import VehicleProvider from "../../contexts/vehicle/vehicle-provider";
import QueryProvider from "../query-provider/query-provider";
import Vehicles from "../vehicles/vehicles";

import "./app.css";

const App = () => {
  return (
    <>
      <QueryProvider>
        <VehicleProvider>
          <Vehicles />
        </VehicleProvider>
      </QueryProvider>
    </>
  );
};

export default App;
