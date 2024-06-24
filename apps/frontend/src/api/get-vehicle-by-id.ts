import client from "./client/client";
import VehicleDetailsDto from "./dto/vehicle-details-dto";

const getVehicleById = async (id: string) => {
  const response = await client.get<VehicleDetailsDto>(`/vehicles/${id}`);

  return response.data;
};

export default getVehicleById;
