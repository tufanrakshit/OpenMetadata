import AppState from '../AppState';
import { getTeams, getUsers } from '../axiosAPIs/userAPI';
import { API_RES_MAX_SIZE } from '../constants/constants';

// Moving this code here from App.tsx
const getAllUsersList = (): void => {
  getUsers('', API_RES_MAX_SIZE).then((res) => {
    AppState.users = res.data.data;
  });
};

const getAllTeams = (): void => {
  getTeams().then((res) => {
    AppState.userTeams = res.data.data;
  });
};

export const fetchAllUsers = () => {
  getAllUsersList();
  getAllTeams();
  // TODO: uncomment below line to update users list in real time.
  // setInterval(getAllUsersList, TIMEOUT.USER_LIST);
};
