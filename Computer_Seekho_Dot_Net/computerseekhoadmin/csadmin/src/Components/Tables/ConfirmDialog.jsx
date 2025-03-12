import React from 'react';
import { Dialog, DialogActions, DialogContent, DialogContentText, DialogTitle, Button } from '@mui/material';

const ConfirmDialog = ({ isOpen, onClose, onConfirm, message }) => (
  <Dialog open={isOpen} onClose={onClose}>
    <DialogTitle>Confirm Action</DialogTitle>
    <DialogContent>
      <DialogContentText>{message}</DialogContentText>
    </DialogContent>
    <DialogActions>
      <Button onClick={onClose} color="primary">Cancel</Button>
      <Button onClick={onConfirm} color="secondary">Confirm</Button>
    </DialogActions>
  </Dialog>
);

export default ConfirmDialog;
